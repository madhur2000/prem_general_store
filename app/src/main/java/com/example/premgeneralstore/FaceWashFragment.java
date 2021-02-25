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
public class FaceWashFragment extends Fragment {

    public FaceWashFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.product_list, container, false);

        ArrayList<Product> FaceWashProducts = new ArrayList<>();
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));
        FaceWashProducts.add(new Product(R.drawable.nivea_men_dark_spot_reduction_face_wash, "Nivea Men dark spot reduction Face wash", "100", "90"));

        ProductAdapter adapter = new ProductAdapter(getActivity(), R.color.category_innerwear, FaceWashProducts);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
