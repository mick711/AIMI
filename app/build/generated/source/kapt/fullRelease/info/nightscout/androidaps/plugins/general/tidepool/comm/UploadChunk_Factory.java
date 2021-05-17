// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.tidepool.comm;

import dagger.internal.Factory;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UploadChunk_Factory implements Factory<UploadChunk> {
  private final Provider<SP> spProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<ProfileFunction> profileFunctionProvider;

  private final Provider<TreatmentsPlugin> treatmentsPluginProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<DateUtil> dateUtilProvider;

  public UploadChunk_Factory(Provider<SP> spProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<ProfileFunction> profileFunctionProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<DateUtil> dateUtilProvider) {
    this.spProvider = spProvider;
    this.rxBusProvider = rxBusProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.profileFunctionProvider = profileFunctionProvider;
    this.treatmentsPluginProvider = treatmentsPluginProvider;
    this.activePluginProvider = activePluginProvider;
    this.dateUtilProvider = dateUtilProvider;
  }

  @Override
  public UploadChunk get() {
    return newInstance(spProvider.get(), rxBusProvider.get(), aapsLoggerProvider.get(), profileFunctionProvider.get(), treatmentsPluginProvider.get(), activePluginProvider.get(), dateUtilProvider.get());
  }

  public static UploadChunk_Factory create(Provider<SP> spProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<AAPSLogger> aapsLoggerProvider,
      Provider<ProfileFunction> profileFunctionProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<DateUtil> dateUtilProvider) {
    return new UploadChunk_Factory(spProvider, rxBusProvider, aapsLoggerProvider, profileFunctionProvider, treatmentsPluginProvider, activePluginProvider, dateUtilProvider);
  }

  public static UploadChunk newInstance(SP sp, RxBusWrapper rxBus, AAPSLogger aapsLogger,
      ProfileFunction profileFunction, TreatmentsPlugin treatmentsPlugin,
      ActivePluginProvider activePlugin, DateUtil dateUtil) {
    return new UploadChunk(sp, rxBus, aapsLogger, profileFunction, treatmentsPlugin, activePlugin, dateUtil);
  }
}
