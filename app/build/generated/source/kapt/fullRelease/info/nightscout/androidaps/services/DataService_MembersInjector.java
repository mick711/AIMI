// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.services;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.Config;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.general.nsclient.NSUpload;
import info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin;
import info.nightscout.androidaps.plugins.profile.ns.NSProfilePlugin;
import info.nightscout.androidaps.plugins.source.DexcomPlugin;
import info.nightscout.androidaps.plugins.source.EversensePlugin;
import info.nightscout.androidaps.plugins.source.GlimpPlugin;
import info.nightscout.androidaps.plugins.source.MM640gPlugin;
import info.nightscout.androidaps.plugins.source.NSClientSourcePlugin;
import info.nightscout.androidaps.plugins.source.PoctechPlugin;
import info.nightscout.androidaps.plugins.source.TomatoPlugin;
import info.nightscout.androidaps.plugins.source.XdripPlugin;
import info.nightscout.androidaps.utils.buildHelper.BuildHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataService_MembersInjector implements MembersInjector<DataService> {
  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<SP> spProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<NSUpload> nsUploadProvider;

  private final Provider<SmsCommunicatorPlugin> smsCommunicatorPluginProvider;

  private final Provider<DexcomPlugin> dexcomPluginProvider;

  private final Provider<EversensePlugin> eversensePluginProvider;

  private final Provider<GlimpPlugin> glimpPluginProvider;

  private final Provider<MM640gPlugin> mm640GPluginProvider;

  private final Provider<NSClientSourcePlugin> nsClientSourcePluginProvider;

  private final Provider<PoctechPlugin> poctechPluginProvider;

  private final Provider<TomatoPlugin> tomatoPluginProvider;

  private final Provider<XdripPlugin> xdripPluginProvider;

  private final Provider<NSProfilePlugin> nsProfilePluginProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<Config> configProvider;

  private final Provider<BuildHelper> buildHelperProvider;

  public DataService_MembersInjector(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<SP> spProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<NSUpload> nsUploadProvider,
      Provider<SmsCommunicatorPlugin> smsCommunicatorPluginProvider,
      Provider<DexcomPlugin> dexcomPluginProvider,
      Provider<EversensePlugin> eversensePluginProvider, Provider<GlimpPlugin> glimpPluginProvider,
      Provider<MM640gPlugin> mm640GPluginProvider,
      Provider<NSClientSourcePlugin> nsClientSourcePluginProvider,
      Provider<PoctechPlugin> poctechPluginProvider, Provider<TomatoPlugin> tomatoPluginProvider,
      Provider<XdripPlugin> xdripPluginProvider, Provider<NSProfilePlugin> nsProfilePluginProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<Config> configProvider,
      Provider<BuildHelper> buildHelperProvider) {
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.spProvider = spProvider;
    this.rxBusProvider = rxBusProvider;
    this.nsUploadProvider = nsUploadProvider;
    this.smsCommunicatorPluginProvider = smsCommunicatorPluginProvider;
    this.dexcomPluginProvider = dexcomPluginProvider;
    this.eversensePluginProvider = eversensePluginProvider;
    this.glimpPluginProvider = glimpPluginProvider;
    this.mm640GPluginProvider = mm640GPluginProvider;
    this.nsClientSourcePluginProvider = nsClientSourcePluginProvider;
    this.poctechPluginProvider = poctechPluginProvider;
    this.tomatoPluginProvider = tomatoPluginProvider;
    this.xdripPluginProvider = xdripPluginProvider;
    this.nsProfilePluginProvider = nsProfilePluginProvider;
    this.activePluginProvider = activePluginProvider;
    this.configProvider = configProvider;
    this.buildHelperProvider = buildHelperProvider;
  }

  public static MembersInjector<DataService> create(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<SP> spProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<NSUpload> nsUploadProvider,
      Provider<SmsCommunicatorPlugin> smsCommunicatorPluginProvider,
      Provider<DexcomPlugin> dexcomPluginProvider,
      Provider<EversensePlugin> eversensePluginProvider, Provider<GlimpPlugin> glimpPluginProvider,
      Provider<MM640gPlugin> mm640GPluginProvider,
      Provider<NSClientSourcePlugin> nsClientSourcePluginProvider,
      Provider<PoctechPlugin> poctechPluginProvider, Provider<TomatoPlugin> tomatoPluginProvider,
      Provider<XdripPlugin> xdripPluginProvider, Provider<NSProfilePlugin> nsProfilePluginProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<Config> configProvider,
      Provider<BuildHelper> buildHelperProvider) {
    return new DataService_MembersInjector(aapsLoggerProvider, spProvider, rxBusProvider, nsUploadProvider, smsCommunicatorPluginProvider, dexcomPluginProvider, eversensePluginProvider, glimpPluginProvider, mm640GPluginProvider, nsClientSourcePluginProvider, poctechPluginProvider, tomatoPluginProvider, xdripPluginProvider, nsProfilePluginProvider, activePluginProvider, configProvider, buildHelperProvider);
  }

  @Override
  public void injectMembers(DataService instance) {
    injectAapsLogger(instance, aapsLoggerProvider.get());
    injectSp(instance, spProvider.get());
    injectRxBus(instance, rxBusProvider.get());
    injectNsUpload(instance, nsUploadProvider.get());
    injectSmsCommunicatorPlugin(instance, smsCommunicatorPluginProvider.get());
    injectDexcomPlugin(instance, dexcomPluginProvider.get());
    injectEversensePlugin(instance, eversensePluginProvider.get());
    injectGlimpPlugin(instance, glimpPluginProvider.get());
    injectMm640GPlugin(instance, mm640GPluginProvider.get());
    injectNsClientSourcePlugin(instance, nsClientSourcePluginProvider.get());
    injectPoctechPlugin(instance, poctechPluginProvider.get());
    injectTomatoPlugin(instance, tomatoPluginProvider.get());
    injectXdripPlugin(instance, xdripPluginProvider.get());
    injectNsProfilePlugin(instance, nsProfilePluginProvider.get());
    injectActivePlugin(instance, activePluginProvider.get());
    injectConfig(instance, configProvider.get());
    injectBuildHelper(instance, buildHelperProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.aapsLogger")
  public static void injectAapsLogger(DataService instance, AAPSLogger aapsLogger) {
    instance.aapsLogger = aapsLogger;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.sp")
  public static void injectSp(DataService instance, SP sp) {
    instance.sp = sp;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.rxBus")
  public static void injectRxBus(DataService instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.nsUpload")
  public static void injectNsUpload(DataService instance, NSUpload nsUpload) {
    instance.nsUpload = nsUpload;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.smsCommunicatorPlugin")
  public static void injectSmsCommunicatorPlugin(DataService instance,
      SmsCommunicatorPlugin smsCommunicatorPlugin) {
    instance.smsCommunicatorPlugin = smsCommunicatorPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.dexcomPlugin")
  public static void injectDexcomPlugin(DataService instance, DexcomPlugin dexcomPlugin) {
    instance.dexcomPlugin = dexcomPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.eversensePlugin")
  public static void injectEversensePlugin(DataService instance, EversensePlugin eversensePlugin) {
    instance.eversensePlugin = eversensePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.glimpPlugin")
  public static void injectGlimpPlugin(DataService instance, GlimpPlugin glimpPlugin) {
    instance.glimpPlugin = glimpPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.mm640GPlugin")
  public static void injectMm640GPlugin(DataService instance, MM640gPlugin mm640GPlugin) {
    instance.mm640GPlugin = mm640GPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.nsClientSourcePlugin")
  public static void injectNsClientSourcePlugin(DataService instance,
      NSClientSourcePlugin nsClientSourcePlugin) {
    instance.nsClientSourcePlugin = nsClientSourcePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.poctechPlugin")
  public static void injectPoctechPlugin(DataService instance, PoctechPlugin poctechPlugin) {
    instance.poctechPlugin = poctechPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.tomatoPlugin")
  public static void injectTomatoPlugin(DataService instance, TomatoPlugin tomatoPlugin) {
    instance.tomatoPlugin = tomatoPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.xdripPlugin")
  public static void injectXdripPlugin(DataService instance, XdripPlugin xdripPlugin) {
    instance.xdripPlugin = xdripPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.nsProfilePlugin")
  public static void injectNsProfilePlugin(DataService instance, NSProfilePlugin nsProfilePlugin) {
    instance.nsProfilePlugin = nsProfilePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.activePlugin")
  public static void injectActivePlugin(DataService instance, ActivePluginProvider activePlugin) {
    instance.activePlugin = activePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.config")
  public static void injectConfig(DataService instance, Config config) {
    instance.config = config;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.services.DataService.buildHelper")
  public static void injectBuildHelper(DataService instance, BuildHelper buildHelper) {
    instance.buildHelper = buildHelper;
  }
}
