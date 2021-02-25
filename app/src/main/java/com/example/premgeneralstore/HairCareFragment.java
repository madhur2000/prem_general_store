package com.example.premgeneralstore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HairCareFragment extends Fragment {

    public HairCareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.product_list, container, false);

        ArrayList<Product> hairCareProducts = new ArrayList<>();
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));
        hairCareProducts.add(new Product(R.drawable.livon_serum, "Livon Hair Serum", "100", "95"));

        ProductAdapter adapter = new ProductAdapter(getActivity(), R.color.category_innerwear, hairCareProducts);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
