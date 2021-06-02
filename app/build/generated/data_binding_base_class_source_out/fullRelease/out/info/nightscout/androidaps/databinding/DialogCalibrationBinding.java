// Generated by view binder compiler. Do not edit!
package info.nightscout.androidaps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import info.nightscout.androidaps.R;
import info.nightscout.androidaps.utils.ui.NumberPicker;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogCalibrationBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final NumberPicker bg;

  @NonNull
  public final LinearLayout bgLayout;

  @NonNull
  public final OkcancelBinding okcancel;

  @NonNull
  public final LinearLayout spacer;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView units;

  private DialogCalibrationBinding(@NonNull ScrollView rootView, @NonNull NumberPicker bg,
      @NonNull LinearLayout bgLayout, @NonNull OkcancelBinding okcancel,
      @NonNull LinearLayout spacer, @NonNull TextView title, @NonNull TextView units) {
    this.rootView = rootView;
    this.bg = bg;
    this.bgLayout = bgLayout;
    this.okcancel = okcancel;
    this.spacer = spacer;
    this.title = title;
    this.units = units;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogCalibrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogCalibrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_calibration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogCalibrationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bg;
      NumberPicker bg = rootView.findViewById(id);
      if (bg == null) {
        break missingId;
      }

      id = R.id.bg_layout;
      LinearLayout bgLayout = rootView.findViewById(id);
      if (bgLayout == null) {
        break missingId;
      }

      id = R.id.okcancel;
      View okcancel = rootView.findViewById(id);
      if (okcancel == null) {
        break missingId;
      }
      OkcancelBinding binding_okcancel = OkcancelBinding.bind(okcancel);

      id = R.id.spacer;
      LinearLayout spacer = rootView.findViewById(id);
      if (spacer == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      id = R.id.units;
      TextView units = rootView.findViewById(id);
      if (units == null) {
        break missingId;
      }

      return new DialogCalibrationBinding((ScrollView) rootView, bg, bgLayout, binding_okcancel,
          spacer, title, units);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
