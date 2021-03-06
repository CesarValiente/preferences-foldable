# Preferences-foldable sample

`androidx.preference` component has been updated to support foldable, dual-screen and large-screen devices.
`SlidingPaneLayout` now is used under the hood in this component and enables `list-detail` capabilities so on a
foldable, dual-screen and large-screen device, we can have a list of preferences on a left pane, and the details of
the currently selected preference on a right pane.

This sample app uses the following components:

- [Preference 1.2.0-rc01](https://developer.android.com/jetpack/androidx/releases/preference#1.2.0-rc01)

For more information, `Preference` component uses under the hood:

- [SlidingPaneLayout 1.2.0-rc01](https://developer.android.com/jetpack/androidx/releases/slidingpanelayout#version_120_2)

And `SlidingPaneLayout` uses:

- [Jetpack Window Manager 1.0.0-rc01](https://developer.android.com/jetpack/androidx/releases/window#1.0.0-rc01)

## How does it work?

On single screen mode on Surface Duo (or single screen devices or multi-window mode on other foldables), a list of
preferences is shown, when selected one, a right pane overlaps the list with the details of that specific
preference. When the app is spanned across displays on Surface Duo and other foldables or on large-screen devices,
we will have two panes side by side, the left pane will have the preference-list and in the right pane the details
of the selected preference or the first one as default.

### Examples

#### App running on a dual-screen device:

Surface Duo showing preferences on single screen mode
![Surface Duo showing preferences on single screen mode](./art/preferences-single-screen.png)

Surface Duo showing the details of a selected preference on single screen mode
![Surface Duo showing the details of a selected preference on single screen mode](./art/preferences-single-screen-open.png)

Surface Duo showing two panes side by side on dual-screen (spanned) portrait mode
![Surface Duo showing two panes side by side on dual-screen (spanned) portrait mode](./art/preferences-dual-screen-portrait.png)

Surface Duo showing two panes side by side on dual-screen (spanned) landscape mode
![Surface Duo showing two panes side by side on dual-screen (spanned) landscape mode](./art/preferences-dual-screen-landscape.png)

#### App running on a foldable device:

Foldable device showing two pane preferences on landscape mode
![Foldable device showing two pane preferences on landscape mode](./art/foldable-landscape.png)

Foldable device showing preference-list pane on multi-window mode
![Foldable device showing preference-list pane on multi-window mode](./art/foldable-multi-window.png)

Foldable device showing preference-detail pane on multi-window mode
![Foldable device showing preference-detail pane on multi-window mode](./art/foldable-multi-window-detail-open.png)

## Code of Conduct

This project has adopted
the [Microsoft Open Source Code of Conduct](https://opensource.microsoft.com/codeofconduct/). For more information
see the [Code of Conduct FAQ](https://opensource.microsoft.com/codeofconduct/faq/)
or contact [opencode@microsoft.com](mailto:opencode@microsoft.com) with any additional questions or comments.

## License

Copyright (c) Microsoft Corporation.

MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
Software.

THE SOFTWARE IS PROVIDED AS IS, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.