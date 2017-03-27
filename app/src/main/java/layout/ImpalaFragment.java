package layout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import br.com.fiap.a2tina_android_ex05_navigationdrawerfragments.Carros;
import br.com.fiap.a2tina_android_ex05_navigationdrawerfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImpalaFragment extends Fragment {

    TextView txtnome;


    public ImpalaFragment() {

    }

//    Fragment fragment = (Fragment) getArguments().getSerializable("carro");


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Carros carros = (Carros)getArguments().getSerializable("carro");
//        txtnome = (TextView) container.findViewById(R.id.txtNome);
//        txtnome.setText(carros.getNome());

        return inflater.inflate(R.layout.fragment_impala, container, false);

    }

}
