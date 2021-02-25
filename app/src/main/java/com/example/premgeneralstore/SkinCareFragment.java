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
public class SkinCareFragment extends Fragment {

    public SkinCareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.product_list, container, false);

        ArrayList<Product> skinCareProducts = new ArrayList<>();
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));
        skinCareProducts.add(new Product(R.drawable.ponds_white_beauty_cream, "Ponds White Beauty Cream", "112", "105"));

        ProductAdapter adapter = new ProductAdapter(getActivity(), R.color.category_innerwear, skinCareProducts);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
