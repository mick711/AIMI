// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.iob.iobCobCalculator;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.sensitivity.SensitivityAAPSPlugin;
import info.nightscout.androidaps.plugins.sensitivity.SensitivityWeightedAveragePlugin;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.FabricPrivacy;
import info.nightscout.androidaps.utils.Profiler;
import info.nightscout.androidaps.utils.buildHelper.BuildHelper;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class IobCobOref1Thread_MembersInjector implements MembersInjector<IobCobOref1Thread> {
  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<SP> spProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<ProfileFunction> profileFunctionProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SensitivityAAPSPlugin> sensitivityAAPSPluginProvider;

  private final Provider<SensitivityWeightedAveragePlugin> sensitivityWeightedAveragePluginProvider;

  private final Provider<BuildHelper> buildHelperProvider;

  private final Provider<Profiler> profilerProvider;

  private final Provider<FabricPrivacy> fabricPrivacyProvider;

  private final Provider<DateUtil> dateUtilProvider;

  public IobCobOref1Thread_MembersInjector(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<SP> spProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<ProfileFunction> profileFunctionProvider, Provider<Context> contextProvider,
      Provider<SensitivityAAPSPlugin> sensitivityAAPSPluginProvider,
      Provider<SensitivityWeightedAveragePlugin> sensitivityWeightedAveragePluginProvider,
      Provider<BuildHelper> buildHelperProvider, Provider<Profiler> profilerProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<DateUtil> dateUtilProvider) {
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.spProvider = spProvider;
    this.rxBusProvider = rxBusProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.profileFunctionProvider = profileFunctionProvider;
    this.contextProvider = contextProvider;
    this.sensitivityAAPSPluginProvider = sensitivityAAPSPluginProvider;
    this.sensitivityWeightedAveragePluginProvider = sensitivityWeightedAveragePluginProvider;
    this.buildHelperProvider = buildHelperProvider;
    this.profilerProvider = profilerProvider;
    this.fabricPrivacyProvider = fabricPrivacyProvider;
    this.dateUtilProvider = dateUtilProvider;
  }

  public static MembersInjector<IobCobOref1Thread> create(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<SP> spProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<ProfileFunction> profileFunctionProvider, Provider<Context> contextProvider,
      Provider<SensitivityAAPSPlugin> sensitivityAAPSPluginProvider,
      Provider<SensitivityWeightedAveragePlugin> sensitivityWeightedAveragePluginProvider,
      Provider<BuildHelper> buildHelperProvider, Provider<Profiler> profilerProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<DateUtil> dateUtilProvider) {
    return new IobCobOref1Thread_MembersInjector(aapsLoggerProvider, spProvider, rxBusProvider, resourceHelperProvider, profileFunctionProvider, contextProvider, sensitivityAAPSPluginProvider, sensitivityWeightedAveragePluginProvider, buildHelperProvider, profilerProvider, fabricPrivacyProvider, dateUtilProvider);
  }

  @Override
  public void injectMembers(IobCobOref1Thread instance) {
    injectAapsLogger(instance, aapsLoggerProvider.get());
    injectSp(instance, spProvider.get());
    injectRxBus(instance, rxBusProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectProfileFunction(instance, profileFunctionProvider.get());
    injectContext(instance, contextProvider.get());
    injectSensitivityAAPSPlugin(instance, sensitivityAAPSPluginProvider.get());
    injectSensitivityWeightedAveragePlugin(instance, sensitivityWeightedAveragePluginProvider.get());
    injectBuildHelper(instance, buildHelperProvider.get());
    injectProfiler(instance, profilerProvider.get());
    injectFabricPrivacy(instance, fabricPrivacyProvider.get());
    injectDateUtil(instance, dateUtilProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.aapsLogger")
  public static void injectAapsLogger(IobCobOref1Thread instance, AAPSLogger aapsLogger) {
    instance.aapsLogger = aapsLogger;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.sp")
  public static void injectSp(IobCobOref1Thread instance, SP sp) {
    instance.sp = sp;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.rxBus")
  public static void injectRxBus(IobCobOref1Thread instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.resourceHelper")
  public static void injectResourceHelper(IobCobOref1Thread instance,
      ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.profileFunction")
  public static void injectProfileFunction(IobCobOref1Thread instance,
      ProfileFunction profileFunction) {
    instance.profileFunction = profileFunction;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.context")
  public static void injectContext(IobCobOref1Thread instance, Context context) {
    instance.context = context;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.sensitivityAAPSPlugin")
  public static void injectSensitivityAAPSPlugin(IobCobOref1Thread instance,
      SensitivityAAPSPlugin sensitivityAAPSPlugin) {
    instance.sensitivityAAPSPlugin = sensitivityAAPSPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.sensitivityWeightedAveragePlugin")
  public static void injectSensitivityWeightedAveragePlugin(IobCobOref1Thread instance,
      SensitivityWeightedAveragePlugin sensitivityWeightedAveragePlugin) {
    instance.sensitivityWeightedAveragePlugin = sensitivityWeightedAveragePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.buildHelper")
  public static void injectBuildHelper(IobCobOref1Thread instance, BuildHelper buildHelper) {
    instance.buildHelper = buildHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.profiler")
  public static void injectProfiler(IobCobOref1Thread instance, Profiler profiler) {
    instance.profiler = profiler;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.fabricPrivacy")
  public static void injectFabricPrivacy(IobCobOref1Thread instance, FabricPrivacy fabricPrivacy) {
    instance.fabricPrivacy = fabricPrivacy;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobOref1Thread.dateUtil")
  public static void injectDateUtil(IobCobOref1Thread instance, DateUtil dateUtil) {
    instance.dateUtil = dateUtil;
  }
}
