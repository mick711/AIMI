// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.treatments;

import android.content.Context;
import dagger.internal.Factory;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.interfaces.CommandQueueProvider;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CarbsGenerator_Factory implements Factory<CarbsGenerator> {
  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<CommandQueueProvider> commandQueueProvider;

  private final Provider<Context> contextProvider;

  public CarbsGenerator_Factory(Provider<ResourceHelper> resourceHelperProvider,
      Provider<ActivePluginProvider> activePluginProvider,
      Provider<CommandQueueProvider> commandQueueProvider, Provider<Context> contextProvider) {
    this.resourceHelperProvider = resourceHelperProvider;
    this.activePluginProvider = activePluginProvider;
    this.commandQueueProvider = commandQueueProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public CarbsGenerator get() {
    return newInstance(resourceHelperProvider.get(), activePluginProvider.get(), commandQueueProvider.get(), contextProvider.get());
  }

  public static CarbsGenerator_Factory create(Provider<ResourceHelper> resourceHelperProvider,
      Provider<ActivePluginProvider> activePluginProvider,
      Provider<CommandQueueProvider> commandQueueProvider, Provider<Context> contextProvider) {
    return new CarbsGenerator_Factory(resourceHelperProvider, activePluginProvider, commandQueueProvider, contextProvider);
  }

  public static CarbsGenerator newInstance(ResourceHelper resourceHelper,
      ActivePluginProvider activePlugin, CommandQueueProvider commandQueue, Context context) {
    return new CarbsGenerator(resourceHelper, activePlugin, commandQueue, context);
  }
}
