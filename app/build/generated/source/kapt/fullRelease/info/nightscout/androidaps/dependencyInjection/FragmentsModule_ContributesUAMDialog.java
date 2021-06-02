package info.nightscout.androidaps.dependencyInjection;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import info.nightscout.androidaps.dialogs.UAMDialog;

@Module(subcomponents = FragmentsModule_ContributesUAMDialog.UAMDialogSubcomponent.class)
public abstract class FragmentsModule_ContributesUAMDialog {
  private FragmentsModule_ContributesUAMDialog() {}

  @Binds
  @IntoMap
  @ClassKey(UAMDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UAMDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface UAMDialogSubcomponent extends AndroidInjector<UAMDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UAMDialog> {}
  }
}
