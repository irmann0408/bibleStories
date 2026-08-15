# Bible Storybook — Interactive Android App

An interactive storybook app for the author's daughter. Each Bible story is a
sequence of scenes: a looping animated video plays in the background, narration
text/audio overlays it, and tappable "hotspots" on characters/objects trigger
sound effects, animations, or narration.

Current status: v1 (MVP) scaffold in place under `app/` — Gradle project,
data model, `DavidAndGoliathStory` content (real narration text from
`Story Layout.txt`), and the `StoryBookScreen` UI. Hotspots exist in the data
model but are unwired (every v1 `StoryPage` has `hotspots = emptyList()`) —
no hotspot SFX/animation assets exist yet. `BibleStory_Plan.txt` and
`Story Layout.txt` are the source design docs this file is derived from.
`narration/` holds the original generated assets for the first story (David
and Goliath) — `Scene N.mp4` + `Scene N_narration.mp3` for scenes 1–7 — kept
as source-of-truth backups; copies renamed to `scene_0N.mp4` /
`scene_0N_narration.mp3` live in `app/src/main/res/raw/`.

Gradle wrapper and a local Android SDK (`cmdline-tools`, `platform-tools`,
`platforms;android-35`, `build-tools;35.0.0`) are installed and
`./gradlew assembleDebug` builds cleanly, producing
`app/build/outputs/apk/debug/app-debug.apk`. The app has been installed and
run on a physical device: Scene 1 plays full-screen with correct
letterboxing, and tapping the narration panel mutes the video and plays the
voiceover as expected. Remaining scenes/nav still need a full manual
click-through — see the plan's Verification section.

The reflection/progression features described in
[Roadmap (Not Yet Implemented)](#roadmap-not-yet-implemented) below are
product direction only — none of that has been built yet.

## Tech Stack

- **Language:** Kotlin
- **UI:** Jetpack Compose (not XML layouts) — needed for the custom
  ratio-based hotspot positioning and state-driven page navigation.
- **Video/audio playback:** Media3 / ExoPlayer.

## Architecture

```
StoryRepository → StoryPage → { Video, Narration, Hotspots }
                                  Media3   Media3    Interaction → Sound / Animation / Voice
```

- **Story content is data, not UI.** Each story (e.g. `david_and_goliath`)
  lives under `stories/<story_name>/scene0N/` and is defined as a list of
  `StoryPage` objects in its own file (e.g. `DavidAndGoliathStory.kt`),
  separate from the screen/UI code.
- **`StoryPage`** (`model/StoryPage.kt`): one scene — id, title, background
  video (`@RawRes videoResId`), narration, optional background music, and a
  list of `Hotspot`s.
- **`Narration`**: `{ text, @RawRes audioResId?, autoPlay = false }` — narration
  text and audio are paired together, but autoplay defaults to **off**: the
  voiceover only plays when the user taps the `NarrationPanel`, matching the
  plan doc's "text ... that can optionally read aloud when tapped" feature.
  The scene's background video, by contrast, autoplays and loops with its
  own audio track (character dialogue) — a separate audio layer from the
  narration.
- **`Hotspot`**: an interactive region on a scene, positioned by **ratio**
  (`x`, `y`, `width`, `height` as 0.0–1.0 fractions of screen size, `x`/`y`
  = top-left), not fixed pixels — so tap targets scale correctly across
  devices. Rendered as an invisible `Box` (no background) overlaid on the
  video.
- **`HotspotAction`** (sealed class): `PlaySound`, `PlayNarration`,
  `PlayAnimation`, `SoundAndAnimation`. Tapping a hotspot dispatches one of
  these through `handleHotspotAction()`, which delegates to dedicated
  managers — keep sound/animation logic out of the composables:
  - `playSound()` → `AudioManager` → Media3 / SoundPool
  - `playNarration()` → `NarrationManager` → Media3
  - `playAnimation()` → `AnimationController` → scene animation
- **`StoryBookScreen`**: renders the current page's video full-screen (own
  ExoPlayer, autoplay + loop), overlays hotspots (no-op in v1) + a tappable
  `NarrationPanel` (bottom text panel — tap replays narration from a second,
  independent ExoPlayer instance; later to be restyled with a
  wooden-frame/parchment storybook look), and Previous/Next buttons that
  step `currentPageIndex` through the page list.

## Conventions

- Keep story content (`StoryPage` data) separate from UI/screen code and from
  the media-playback engine — three distinct layers: data → UI → playback.
- Prefer ratio-based (0.0–1.0) coordinates for anything screen-position
  related; never hardcode pixel positions for hotspots.
- New stories follow the same `stories/<story_name>/sceneNN` folder shape as
  `david_and_goliath` (see plan for `noahs_ark`, `feeding_5000`,
  `daniel_lions`, `jesus_calms_storm` as planned future stories).

## Roadmap (Not Yet Implemented)

Everything below this point — reflection questions, "Remember...", prayer,
Story Stars, and the Bible Adventure Album — is product direction for a
future version, not current app behavior. There is no corresponding code,
data model, or screen for any of it yet (no `ReflectionQuestion`,
`StoryCompletion`, `Star`, or `Album` types exist; `StoryBookScreen` has no
flow after scene 7). Treat this section as design guidance to follow *when*
these features are built, not a description of what exists today.

### Story Completion & Meaningful Reflection

The app should eventually end each completed Bible story with a short, child-friendly reflection.

The goal is to make the application more than entertainment. Each story should give the child a simple opportunity to remember the Bible lesson and connect it to everyday life.

#### "What Did We Learn?"

A completed story may present approximately three simple questions.

Example for David & Goliath:

**Who helped David?**

- A. Goliath
- B. God
- C. The king

Guidelines:

- Questions should be appropriate for children around age 7+.
- Questions should reinforce the actual Bible story.
- Use simple vocabulary.
- Avoid trick questions.
- Make the correct answer clear from the story.
- Do not turn the reflection into a difficult test.
- A wrong answer must never punish the child or remove progress.

Recommended flow:

```text
Final Scene
    ↓
Story Complete!
    ↓
What Did We Learn?
    ↓
Question 1
    ↓
Question 2
    ↓
Question 3
    ↓
Remember...
    ↓
Let's Pray
    ↓
Story Stars
    ↓
Bible Adventure Album
```

#### "Remember..."

After the questions, show one short takeaway that captures the story's lesson.

Example:

> "When we are afraid, we can trust God."

The exact takeaway must match the lesson of the particular Bible story. Do not invent theological claims that are not supported by the story or the project's source material.

#### "Let's Pray"

Optionally provide a very short, child-friendly prayer.

Example:

> "Dear God, thank You for being with us when we are afraid. Help us trust You. Amen."

Prayers should be:

- Very short
- Easy for a child to understand
- Connected to the story's lesson
- Respectful
- Easy to repeat

The reflection should feel like a natural continuation of the story, not a school exam.

Avoid:

- Timers
- Lives/hearts
- Negative sounds
- Shame-based messages
- Losing progress for wrong answers
- Competitive scoring

The purpose is learning and reflection, not competition.

---

### Story Stars & Positive Progression

Use **Story Stars** as the primary progression mechanic instead of coins, lives, gems, or other commercial-game mechanics.

When a child completes a story:

```text
Story Complete!

⭐ ⭐ ⭐
```

The initial design can use three stars.

Possible future criteria:

- ⭐ Finished the story
- ⭐ Completed the reflection
- ⭐ Explored the interactive elements

These criteria are optional design guidance, not a requirement for the MVP.

The child should always feel successful for completing and learning the story. Do not require perfect quiz performance to complete a story.

Never remove previously earned stars or progress because of a wrong answer.

#### Bible Adventure Album

Completed stories may unlock a collectible in a **Bible Adventure Album**.

Example:

```text
David & Goliath
    🧑 David

Daniel and the Lions
    🦁 Lion

Jonah
    🐋 Great Fish

Noah's Ark
    🚢 Noah's Ark

Feeding the 5,000
    🐟 Fish & Loaves
```

The album is intended to give children a gentle reason to return to the app while celebrating the Bible stories they have experienced.

Collectibles should represent meaningful elements from the stories, such as:

- Bible characters
- Animals
- Objects
- Places
- Story symbols

Avoid:

- Gambling-like mechanics
- Random loot
- Paid collectibles
- Competitive leaderboards
- Artificial scarcity
- Pressure to keep playing

The album should feel like a **Bible Story Collection**, not a commercial mobile-game reward system.

#### Progression Principles

Progression should be:

- Positive
- Calm
- Optional
- Non-competitive
- Child-friendly
- Connected to the Bible stories

Future progress persistence should preferably use local storage unless there is an explicit requirement for another storage mechanism.

---

### Product Direction

The storybook should remain focused on three experiences:

```text
1. EXPERIENCE THE STORY
   Animated scenes + narration

2. EXPLORE THE STORY
   Tap characters and objects to discover interactions

3. REMEMBER THE STORY
   Questions + takeaway + optional prayer + Story Stars
```

The goal is to create an experience that parents can see as both **engaging and meaningful**, while keeping the child experience simple and enjoyable.

