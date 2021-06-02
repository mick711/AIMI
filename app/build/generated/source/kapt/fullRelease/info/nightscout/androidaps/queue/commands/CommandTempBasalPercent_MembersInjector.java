// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.queue.commands;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CommandTempBasalPercent_MembersInjector implements MembersInjector<CommandTempBasalPercent> {
  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  public CommandTempBasalPercent_MembersInjector(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<ActivePluginProvider> activePluginProvider) {
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.activePluginProvider = activePluginProvider;
  }

  public static MembersInjector<CommandTempBasalPercent> create(
      Provider<AAPSLogger> aapsLoggerProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<ActivePluginProvider> activePluginProvider) {
    return new CommandTempBasalPercent_MembersInjector(aapsLoggerProvider, resourceHelperProvider, activePluginProvider);
  }

  @Override
  public void injectMembers(CommandTempBasalPercent instance) {
    Command_MembersInjector.injectAapsLogger(instance, aapsLoggerProvider.get());
    Command_MembersInjector.injectResourceHelper(instance, resourceHelperProvider.get());
    injectActivePlugin(instance, activePluginProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.queue.commands.CommandTempBasalPercent.activePlugin")
  public static void injectActivePlugin(CommandTempBasalPercent instance,
      ActivePluginProvider activePlugin) {
    instance.activePlugin = activePlugin;
  }
}
