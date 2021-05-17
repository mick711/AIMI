// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.wear.wearintegration;

import dagger.MembersInjector;
import dagger.android.HasAndroidInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.Config;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.aps.loop.LoopPlugin;
import info.nightscout.androidaps.plugins.general.nsclient.data.NSDeviceStatus;
import info.nightscout.androidaps.plugins.general.wear.ActionStringHandler;
import info.nightscout.androidaps.plugins.general.wear.WearPlugin;
import info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin;
import info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin;
import info.nightscout.androidaps.receivers.ReceiverStatusStore;
import info.nightscout.androidaps.utils.DefaultValueHelper;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WatchUpdaterService_MembersInjector implements MembersInjector<WatchUpdaterService> {
  private final Provider<HasAndroidInjector> injectorProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<WearPlugin> wearPluginProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<SP> spProvider;

  private final Provider<ProfileFunction> profileFunctionProvider;

  private final Provider<DefaultValueHelper> defaultValueHelperProvider;

  private final Provider<NSDeviceStatus> nsDeviceStatusProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<LoopPlugin> loopPluginProvider;

  private final Provider<IobCobCalculatorPlugin> iobCobCalculatorPluginProvider;

  private final Provider<TreatmentsPlugin> treatmentsPluginProvider;

  private final Provider<ActionStringHandler> actionStringHandlerProvider;

  private final Provider<ReceiverStatusStore> receiverStatusStoreProvider;

  private final Provider<Config> configProvider;

  public WatchUpdaterService_MembersInjector(Provider<HasAndroidInjector> injectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<WearPlugin> wearPluginProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<SP> spProvider,
      Provider<ProfileFunction> profileFunctionProvider,
      Provider<DefaultValueHelper> defaultValueHelperProvider,
      Provider<NSDeviceStatus> nsDeviceStatusProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<LoopPlugin> loopPluginProvider,
      Provider<IobCobCalculatorPlugin> iobCobCalculatorPluginProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider,
      Provider<ActionStringHandler> actionStringHandlerProvider,
      Provider<ReceiverStatusStore> receiverStatusStoreProvider, Provider<Config> configProvider) {
    this.injectorProvider = injectorProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.wearPluginProvider = wearPluginProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.spProvider = spProvider;
    this.profileFunctionProvider = profileFunctionProvider;
    this.defaultValueHelperProvider = defaultValueHelperProvider;
    this.nsDeviceStatusProvider = nsDeviceStatusProvider;
    this.activePluginProvider = activePluginProvider;
    this.loopPluginProvider = loopPluginProvider;
    this.iobCobCalculatorPluginProvider = iobCobCalculatorPluginProvider;
    this.treatmentsPluginProvider = treatmentsPluginProvider;
    this.actionStringHandlerProvider = actionStringHandlerProvider;
    this.receiverStatusStoreProvider = receiverStatusStoreProvider;
    this.configProvider = configProvider;
  }

  public static MembersInjector<WatchUpdaterService> create(
      Provider<HasAndroidInjector> injectorProvider, Provider<AAPSLogger> aapsLoggerProvider,
      Provider<WearPlugin> wearPluginProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<SP> spProvider, Provider<ProfileFunction> profileFunctionProvider,
      Provider<DefaultValueHelper> defaultValueHelperProvider,
      Provider<NSDeviceStatus> nsDeviceStatusProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<LoopPlugin> loopPluginProvider,
      Provider<IobCobCalculatorPlugin> iobCobCalculatorPluginProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider,
      Provider<ActionStringHandler> actionStringHandlerProvider,
      Provider<ReceiverStatusStore> receiverStatusStoreProvider, Provider<Config> configProvider) {
    return new WatchUpdaterService_MembersInjector(injectorProvider, aapsLoggerProvider, wearPluginProvider, resourceHelperProvider, spProvider, profileFunctionProvider, defaultValueHelperProvider, nsDeviceStatusProvider, activePluginProvider, loopPluginProvider, iobCobCalculatorPluginProvider, treatmentsPluginProvider, actionStringHandlerProvider, receiverStatusStoreProvider, configProvider);
  }

  @Override
  public void injectMembers(WatchUpdaterService instance) {
    injectInjector(instance, injectorProvider.get());
    injectAapsLogger(instance, aapsLoggerProvider.get());
    injectWearPlugin(instance, wearPluginProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectSp(instance, spProvider.get());
    injectProfileFunction(instance, profileFunctionProvider.get());
    injectDefaultValueHelper(instance, defaultValueHelperProvider.get());
    injectNsDeviceStatus(instance, nsDeviceStatusProvider.get());
    injectActivePlugin(instance, activePluginProvider.get());
    injectLoopPlugin(instance, loopPluginProvider.get());
    injectIobCobCalculatorPlugin(instance, iobCobCalculatorPluginProvider.get());
    injectTreatmentsPlugin(instance, treatmentsPluginProvider.get());
    injectActionStringHandler(instance, actionStringHandlerProvider.get());
    injectReceiverStatusStore(instance, receiverStatusStoreProvider.get());
    injectConfig(instance, configProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.injector")
  public static void injectInjector(WatchUpdaterService instance, HasAndroidInjector injector) {
    instance.injector = injector;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.aapsLogger")
  public static void injectAapsLogger(WatchUpdaterService instance, AAPSLogger aapsLogger) {
    instance.aapsLogger = aapsLogger;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.wearPlugin")
  public static void injectWearPlugin(WatchUpdaterService instance, WearPlugin wearPlugin) {
    instance.wearPlugin = wearPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.resourceHelper")
  public static void injectResourceHelper(WatchUpdaterService instance,
      ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.sp")
  public static void injectSp(WatchUpdaterService instance, SP sp) {
    instance.sp = sp;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.profileFunction")
  public static void injectProfileFunction(WatchUpdaterService instance,
      ProfileFunction profileFunction) {
    instance.profileFunction = profileFunction;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.defaultValueHelper")
  public static void injectDefaultValueHelper(WatchUpdaterService instance,
      DefaultValueHelper defaultValueHelper) {
    instance.defaultValueHelper = defaultValueHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.nsDeviceStatus")
  public static void injectNsDeviceStatus(WatchUpdaterService instance,
      NSDeviceStatus nsDeviceStatus) {
    instance.nsDeviceStatus = nsDeviceStatus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.activePlugin")
  public static void injectActivePlugin(WatchUpdaterService instance,
      ActivePluginProvider activePlugin) {
    instance.activePlugin = activePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.loopPlugin")
  public static void injectLoopPlugin(WatchUpdaterService instance, LoopPlugin loopPlugin) {
    instance.loopPlugin = loopPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.iobCobCalculatorPlugin")
  public static void injectIobCobCalculatorPlugin(WatchUpdaterService instance,
      IobCobCalculatorPlugin iobCobCalculatorPlugin) {
    instance.iobCobCalculatorPlugin = iobCobCalculatorPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.treatmentsPlugin")
  public static void injectTreatmentsPlugin(WatchUpdaterService instance,
      TreatmentsPlugin treatmentsPlugin) {
    instance.treatmentsPlugin = treatmentsPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.actionStringHandler")
  public static void injectActionStringHandler(WatchUpdaterService instance,
      ActionStringHandler actionStringHandler) {
    instance.actionStringHandler = actionStringHandler;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.receiverStatusStore")
  public static void injectReceiverStatusStore(WatchUpdaterService instance,
      ReceiverStatusStore receiverStatusStore) {
    instance.receiverStatusStore = receiverStatusStore;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.wearintegration.WatchUpdaterService.config")
  public static void injectConfig(WatchUpdaterService instance, Config config) {
    instance.config = config;
  }
}
