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
public class CosmeticsFragment extends Fragment {

    public CosmeticsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.product_list, container, false);

        ArrayList<Product> cosmetics = new ArrayList<>();
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));
        cosmetics.add(new Product(R.drawable.lakme_lipstick, "Lakme Lipstick", "100", "90"));

        ProductAdapter adapter = new ProductAdapter(getActivity(), R.color.category_innerwear, cosmetics);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;


    }
}
