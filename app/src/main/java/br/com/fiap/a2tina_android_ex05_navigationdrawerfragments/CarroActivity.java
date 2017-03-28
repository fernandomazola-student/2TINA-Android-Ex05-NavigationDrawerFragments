package br.com.fiap.a2tina_android_ex05_navigationdrawerfragments;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.BundleCompat;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import layout.BrasiliaFragment;
import layout.CadilacFragment;
import layout.Covertte1974Fragment;
import layout.FuscaFragment;
import layout.ImpalaFragment;
import layout.MaverickGTFragment;

public class CarroActivity extends AppCompatActivity {

    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    FrameLayout fragmentContainer;
    List<Carros> carros;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);
        final GeraCarros carross = new GeraCarros();
        carros = carross.listaCarros();
        t = (TextView)findViewById(R.id.t);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout)findViewById(R.id.activity_carro);
        fragmentContainer = (FrameLayout)findViewById(R.id.fragment_container);

        setSupportActionBar(toolbar);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.abrir, R.string.fechar);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView = (NavigationView)findViewById(R.id.navigationview);


       navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override

           public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.mnImpala){
//                    for(int i = 0; i < carros.size(); i++ ){
//
//                        if (carros.get(i).getNome().equals("Impala")){
//                            int ii = i;
//                            Toast.makeText(CarroActivity.this, carros.get(ii).getDescricao() + "" , Toast.LENGTH_SHORT).show();
//                        }
//
//                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ImpalaFragment()).addToBackStack(null).commit();
               }else if(item.getItemId() == R.id.mnCadilac){
                   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CadilacFragment()).addToBackStack(null).commit();
               }else if(item.getItemId() == R.id.mnMaverickGT){
                   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MaverickGTFragment()).addToBackStack(null).commit();
               }else if(item.getItemId() == R.id.mnFusca){
                   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FuscaFragment()).addToBackStack(null).commit();
               }else if(item.getItemId() == R.id.mnBrasilia){
                   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new BrasiliaFragment()).addToBackStack(null).commit();
               }else if(item.getItemId() == R.id.mnCorvette1974){
                   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Covertte1974Fragment()).addToBackStack(null).commit();
               }
               drawerLayout = (DrawerLayout) findViewById(R.id.activity_carro);
               drawerLayout.closeDrawer(GravityCompat.START);
               return false;
    }
});

    }




//    public void abrirFragment(Fragment fragment){
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack(null).commit();
//    }
//
//   public void CarroCadilac(){
//       getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CadilacFragment()).commit();
//  }
}
