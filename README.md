# Responsive Layout 1

## Android Application - Responsive UI Demo

**Student:** Guo Yuqi  
**Student ID:** 20243006972

---

## Project Overview

This Android application demonstrates responsive user interface design using two different layout techniques:

### Part 1: LinearLayout with Weights
- Uses `LinearLayout` for all layouts (parent and inner)
- Implements `android:orientation` for vertical/horizontal arrangement
- Uses `layout_weight` to distribute available space proportionally
- Uses `0dp` for dimensions corresponding to the weighted direction
- Uses `match_parent` and `wrap_content` appropriately

### Part 2: ConstraintLayout with Weights
- Uses `ConstraintLayout` as the root and inner layouts
- Positions views using constraints relative to parent and other views
- Uses guidelines for responsive layout positioning
- Implements chains for button arrangement
- Maintains usability at different screen sizes

---

## Project Structure

```
ResponsiveLayout1/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/responsivelayout/
│   │   │   └── MainActivity.java
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   ├── activity_main_linear.xml    (Part 1)
│   │   │   │   └── activity_main_constraint.xml (Part 2)
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   ├── colors.xml
│   │   │   │   └── themes.xml
│   │   │   ├── drawable/
│   │   │   └── mipmap-*/
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
├── gradle.properties
└── .gitignore
```

---

## Requirements

- Android Studio (Arctic Fox or later)
- Android SDK (API Level 24 or higher)
- JDK 8 or higher

---

## Building the Project

1. Open Android Studio
2. Select "Open an existing project"
3. Navigate to and select the `ResponsiveLayout1` folder
4. Wait for Gradle sync to complete
5. Run the app on an emulator or device

---

## Layout Switching

To switch between layouts:
1. Open `MainActivity.java`
2. Uncomment the desired layout line in `onCreate()`:
   - `setContentView(R.layout.activity_main_linear);` - For Part 1
   - `setContentView(R.layout.activity_main_constraint);` - For Part 2

---

## Key Features

- ✅ Responsive UI design
- ✅ No hard-coded pixel dimensions
- ✅ Uses layout weights for space distribution
- ✅ Adapts to different screen sizes
- ✅ Clean, well-commented code

---

## GitHub Repository

Repository: `20243006972-ResponsiveLayout1`
