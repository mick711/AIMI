// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.dialogs;

import android.content.Context;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerDialogFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.Config;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.interfaces.CommandQueueProvider;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TreatmentDialog_MembersInjector implements MembersInjector<TreatmentDialog> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<SP> spProvider;

  private final Provider<DateUtil> dateUtilProvider;

  private final Provider<ConstraintChecker> constraintCheckerProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<CommandQueueProvider> commandQueueProvider;

  private final Provider<Context> ctxProvider;

  private final Provider<Config> configProvider;

  public TreatmentDialog_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<SP> spProvider,
      Provider<DateUtil> dateUtilProvider, Provider<ConstraintChecker> constraintCheckerProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<ActivePluginProvider> activePluginProvider,
      Provider<CommandQueueProvider> commandQueueProvider, Provider<Context> ctxProvider,
      Provider<Config> configProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.spProvider = spProvider;
    this.dateUtilProvider = dateUtilProvider;
    this.constraintCheckerProvider = constraintCheckerProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.activePluginProvider = activePluginProvider;
    this.commandQueueProvider = commandQueueProvider;
    this.ctxProvider = ctxProvider;
    this.configProvider = configProvider;
  }

  public static MembersInjector<TreatmentDialog> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<SP> spProvider,
      Provider<DateUtil> dateUtilProvider, Provider<ConstraintChecker> constraintCheckerProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<ActivePluginProvider> activePluginProvider,
      Provider<CommandQueueProvider> commandQueueProvider, Provider<Context> ctxProvider,
      Provider<Config> configProvider) {
    return new TreatmentDialog_MembersInjector(androidInjectorProvider, aapsLoggerProvider, spProvider, dateUtilProvider, constraintCheckerProvider, resourceHelperProvider, activePluginProvider, commandQueueProvider, ctxProvider, configProvider);
  }

  @Override
  public void injectMembers(TreatmentDialog instance) {
    DaggerDialogFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    DialogFragmentWithDate_MembersInjector.injectAapsLogger(instance, aapsLoggerProvider.get());
    DialogFragmentWithDate_MembersInjector.injectSp(instance, spProvider.get());
    DialogFragmentWithDate_MembersInjector.injectDateUtil(instance, dateUtilProvider.get());
    injectConstraintChecker(instance, constraintCheckerProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectActivePlugin(instance, activePluginProvider.get());
    injectCommandQueue(instance, commandQueueProvider.get());
    injectCtx(instance, ctxProvider.get());
    injectConfig(instance, configProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.TreatmentDialog.constraintChecker")
  public static void injectConstraintChecker(TreatmentDialog instance,
      ConstraintChecker constraintChecker) {
    instance.constraintChecker = constraintChecker;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.TreatmentDialog.resourceHelper")
  public static void injectResourceHelper(TreatmentDialog instance, ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.TreatmentDialog.activePlugin")
  public static void injectActivePlugin(TreatmentDialog instance,
      ActivePluginProvider activePlugin) {
    instance.activePlugin = activePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.TreatmentDialog.commandQueue")
  public static void injectCommandQueue(TreatmentDialog instance,
      CommandQueueProvider commandQueue) {
    instance.commandQueue = commandQueue;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.TreatmentDialog.ctx")
  public static void injectCtx(TreatmentDialog instance, Context ctx) {
    instance.ctx = ctx;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.TreatmentDialog.config")
  public static void injectConfig(TreatmentDialog instance, Config config) {
    instance.config = config;
  }
}
