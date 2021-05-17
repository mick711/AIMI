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
public final class StaticLabel_MembersInjector implements MembersInjector<StaticLabel> {
  private final Provider<ResourceHelper> resourceHelperProvider;

  public StaticLabel_MembersInjector(Provider<ResourceHelper> resourceHelperProvider) {
    this.resourceHelperProvider = resourceHelperProvider;
  }

  public static MembersInjector<StaticLabel> create(
      Provider<ResourceHelper> resourceHelperProvider) {
    return new StaticLabel_MembersInjector(resourceHelperProvider);
  }

  @Override
  public void injectMembers(StaticLabel instance) {
    injectResourceHelper(instance, resourceHelperProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.elements.StaticLabel.resourceHelper")
  public static void injectResourceHelper(StaticLabel instance, ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }
}
