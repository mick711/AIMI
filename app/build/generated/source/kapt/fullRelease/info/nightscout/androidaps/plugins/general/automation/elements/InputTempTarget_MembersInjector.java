// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.automation.elements;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InputTempTarget_MembersInjector implements MembersInjector<InputTempTarget> {
  private final Provider<ProfileFunction> profileFunctionProvider;

  public InputTempTarget_MembersInjector(Provider<ProfileFunction> profileFunctionProvider) {
    this.profileFunctionProvider = profileFunctionProvider;
  }

  public static MembersInjector<InputTempTarget> create(
      Provider<ProfileFunction> profileFunctionProvider) {
    return new InputTempTarget_MembersInjector(profileFunctionProvider);
  }

  @Override
  public void injectMembers(InputTempTarget instance) {
    injectProfileFunction(instance, profileFunctionProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.elements.InputTempTarget.profileFunction")
  public static void injectProfileFunction(InputTempTarget instance,
      ProfileFunction profileFunction) {
    instance.profileFunction = profileFunction;
  }
}
