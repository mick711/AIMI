// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.openhumans;

import android.content.Context;
import dagger.android.HasAndroidInjector;
import dagger.internal.Factory;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OpenHumansUploader_Factory implements Factory<OpenHumansUploader> {
  private final Provider<HasAndroidInjector> injectorProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<SP> spProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<Context> contextProvider;

  private final Provider<TreatmentsPlugin> treatmentsPluginProvider;

  public OpenHumansUploader_Factory(Provider<HasAndroidInjector> injectorProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<AAPSLogger> aapsLoggerProvider,
      Provider<SP> spProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<Context> contextProvider, Provider<TreatmentsPlugin> treatmentsPluginProvider) {
    this.injectorProvider = injectorProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.spProvider = spProvider;
    this.rxBusProvider = rxBusProvider;
    this.contextProvider = contextProvider;
    this.treatmentsPluginProvider = treatmentsPluginProvider;
  }

  @Override
  public OpenHumansUploader get() {
    return newInstance(injectorProvider.get(), resourceHelperProvider.get(), aapsLoggerProvider.get(), spProvider.get(), rxBusProvider.get(), contextProvider.get(), treatmentsPluginProvider.get());
  }

  public static OpenHumansUploader_Factory create(Provider<HasAndroidInjector> injectorProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<AAPSLogger> aapsLoggerProvider,
      Provider<SP> spProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<Context> contextProvider, Provider<TreatmentsPlugin> treatmentsPluginProvider) {
    return new OpenHumansUploader_Factory(injectorProvider, resourceHelperProvider, aapsLoggerProvider, spProvider, rxBusProvider, contextProvider, treatmentsPluginProvider);
  }

  public static OpenHumansUploader newInstance(HasAndroidInjector injector,
      ResourceHelper resourceHelper, AAPSLogger aapsLogger, SP sp, RxBusWrapper rxBus,
      Context context, TreatmentsPlugin treatmentsPlugin) {
    return new OpenHumansUploader(injector, resourceHelper, aapsLogger, sp, rxBus, context, treatmentsPlugin);
  }
}
