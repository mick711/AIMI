// Generated by view binder compiler. Do not edit!
package info.nightscout.androidaps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.jjoe64.graphview.GraphView;
import info.nightscout.androidaps.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OverviewGraphsLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final GraphView overviewBggraph;

  @NonNull
  public final ImageButton overviewChartMenuButton;

  @NonNull
  public final TextView overviewIobcalculationprogess;

  @NonNull
  public final LinearLayout overviewIobgraph;

  private OverviewGraphsLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull GraphView overviewBggraph, @NonNull ImageButton overviewChartMenuButton,
      @NonNull TextView overviewIobcalculationprogess, @NonNull LinearLayout overviewIobgraph) {
    this.rootView = rootView;
    this.overviewBggraph = overviewBggraph;
    this.overviewChartMenuButton = overviewChartMenuButton;
    this.overviewIobcalculationprogess = overviewIobcalculationprogess;
    this.overviewIobgraph = overviewIobgraph;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OverviewGraphsLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OverviewGraphsLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.overview_graphs_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OverviewGraphsLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.overview_bggraph;
      GraphView overviewBggraph = rootView.findViewById(id);
      if (overviewBggraph == null) {
        break missingId;
      }

      id = R.id.overview_chartMenuButton;
      ImageButton overviewChartMenuButton = rootView.findViewById(id);
      if (overviewChartMenuButton == null) {
        break missingId;
      }

      id = R.id.overview_iobcalculationprogess;
      TextView overviewIobcalculationprogess = rootView.findViewById(id);
      if (overviewIobcalculationprogess == null) {
        break missingId;
      }

      id = R.id.overview_iobgraph;
      LinearLayout overviewIobgraph = rootView.findViewById(id);
      if (overviewIobgraph == null) {
        break missingId;
      }

      return new OverviewGraphsLayoutBinding((LinearLayout) rootView, overviewBggraph,
          overviewChartMenuButton, overviewIobcalculationprogess, overviewIobgraph);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
