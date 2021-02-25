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
public class GroomingFragment extends Fragment {

    public GroomingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.product_list, container, false);

        ArrayList<Product> groomingProducts = new ArrayList<>();
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));
        groomingProducts.add(new Product(R.drawable.axe_signature_shaving_cream, "Axe Signature Shaving Cream", "100", "90"));

        ProductAdapter adapter = new ProductAdapter(getActivity(), R.color.category_innerwear, groomingProducts);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
