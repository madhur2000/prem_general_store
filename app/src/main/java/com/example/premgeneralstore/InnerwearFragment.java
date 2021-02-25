package com.example.premgeneralstore;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class InnerwearFragment extends Fragment {
    LinearLayout quantityLinearLayout;
    EditText quantityEditText;
    TextView priceTextView;
    RelativeLayout addToCartRelativeLayout;
    int currentQuantity=1;

    public InnerwearFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.product_list, container, false);

//        quantityLinearLayout = (LinearLayout) rootView.findViewById(R.id.quantity_linear_layout);
//        quantityEditText = (EditText) rootView.findViewById(R.id.quantity_edit_text);
//        priceTextView = (TextView) rootView.findViewById(R.id.price_text_view);
//        addToCartTextView = (TextView) rootView.findViewById(R.id.add_to_cart_text_view);


        final ArrayList<Product> inners = new ArrayList<>();
        inners.add(new Product(R.drawable.jockey_thermal_men, "Jockey Body Warmer (Men)", "1200", "1100", "10"));
        inners.add(new Product(R.drawable.macroman_t_shirt, "Macroman T Shirt", "1000", "920", "10"));
        inners.add(new Product(R.drawable.dixcy_scott_trouser, "dixcy_scott_trouser", "700", "750", "10"));
        inners.add(new Product(R.drawable.jockey_t_shirt, "jockey_t_shirt", "800", "490", "10"));
        inners.add(new Product(R.drawable.jockey_underwear_men, "jockey_underwear_men", "850", "800", "10"));
        inners.add(new Product(R.drawable.lux_inferno_mens, "lux_inferno_mens", "220", "200", "10"));
        inners.add(new Product(R.drawable.jockey_socks_woolen, "jockey_socks_woolen", "300", "280", "10"));
        inners.add(new Product(R.drawable.jockey_underwear_men, "jockey_underwear_men", "550", "520", "10"));
        inners.add(new Product(R.drawable.macroman_underwear_men, "macroman_underwear_men", "620", "500", "10"));
        inners.add(new Product(R.drawable.onn_underwear_men, "onn_underwear_men", "680", "670", "10"));
        inners.add(new Product(R.drawable.van_heusen_underwear_men, "van_heusen_underwear_men", "295", "285", "10"));

        ProductAdapter adapter = new ProductAdapter(getActivity(), R.color.category_innerwear, inners);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Product product = inners.get(i);
//                rootView.findFocus();
                quantityLinearLayout = (LinearLayout) rootView.findViewById(R.id.quantity_linear_layout);
                quantityEditText = (EditText) rootView.findViewById(R.id.quantity_edit_text);
                priceTextView = (TextView) rootView.findViewById(R.id.price_text_view);
                addToCartRelativeLayout = rootView.findViewById(R.id.add_to_cart_relative_layout);
//                Intent innerIntent = new Intent(view.getContext(), SelectedItemDetails.class);
//                innerIntent.putExtra(SelectedItemDetails.ITEM_NAME_EXTRA, product.getProductName());
//                innerIntent.putExtra(SelectedItemDetails.ITEM_PRICE_EXTRA, product.getRateInt());
//                startActivity(innerIntent);
                int itemPrice = product.getRateInt();
                quantityEditText.setText("1");
                quantityLinearLayout.setVisibility(View.VISIBLE);
                priceTextView.setText("Price: ₹" + itemPrice + "");
                priceTextView.setVisibility(View.VISIBLE);
                addToCartRelativeLayout.setVisibility(View.GONE);
            }
        });

        return rootView;
    }
}
