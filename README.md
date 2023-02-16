# ViewModelExample

Simple sample of View Model.

- add dependency at build.gradle app
- Create a ViewModel class extending from ViewModel, associated to an activity or fragment.
- We need a class attribute viewModel in Activity or fragment. This class contains the used data in Activity or Fragment, and can contain methods, too.
-- Instantiate always with ViewModelProvider.
- In ViewModel class put attributes to save the data.
- in init {...} bloc put instructions to run when the class is created.
- Put if, it's necessary, some funcions.
- ViewModel persist across config changes and rotation screens.
