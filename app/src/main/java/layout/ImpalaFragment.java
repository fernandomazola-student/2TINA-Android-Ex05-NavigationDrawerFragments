package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.fiap.a2tina_android_ex05_navigationdrawerfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImpalaFragment extends Fragment {


    public ImpalaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_impala, container, false);
    }

}
