// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.automation.elements;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InputDelta_MembersInjector implements MembersInjector<InputDelta> {
  private final Provider<ResourceHelper> resourceHelperProvider;

  public InputDelta_MembersInjector(Provider<ResourceHelper> resourceHelperProvider) {
    this.resourceHelperProvider = resourceHelperProvider;
  }

  public static MembersInjector<InputDelta> create(
      Provider<ResourceHelper> resourceHelperProvider) {
    return new InputDelta_MembersInjector(resourceHelperProvider);
  }

  @Override
  public void injectMembers(InputDelta instance) {
    injectResourceHelper(instance, resourceHelperProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.elements.InputDelta.resourceHelper")
  public static void injectResourceHelper(InputDelta instance, ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }
}
