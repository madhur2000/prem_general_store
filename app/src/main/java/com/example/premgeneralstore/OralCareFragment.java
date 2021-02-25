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
public class OralCareFragment extends Fragment {

    public OralCareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.product_list, container, false);

        ArrayList<Product> oralCareProducts = new ArrayList<>();
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));
        oralCareProducts.add(new Product(R.drawable.pepsodent_toothpaste, "Pepsodent Toothpaste (150g)", "100", "90"));

        ProductAdapter adapter = new ProductAdapter(getActivity(), R.color.category_innerwear, oralCareProducts);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;


    }
}
