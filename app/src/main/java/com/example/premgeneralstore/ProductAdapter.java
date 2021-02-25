package com.example.premgeneralstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {

    private int resource;
    public ProductAdapter(@NonNull Context context, int resource, @NonNull List<Product> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Product currentProduct = getItem(position);

        TextView productNameTextView = listItemView.findViewById(R.id.product_name_text_view);
        productNameTextView.setText(currentProduct.getProductName());

//        TextView mrpTextView = listItemView.findViewById(R.id.mrp_text_view);
//        mrpTextView.setText(currentProduct.getMRP());
//
//        TextView rateTextView = listItemView.findViewById(R.id.rate_text_view);
//        rateTextView.setText(currentProduct.getRate());

        TextView discountTextView = listItemView.findViewById(R.id.discount_text_view);

        if(!currentProduct.getDiscount().equals("")) {
            discountTextView.setVisibility(View.VISIBLE);
            discountTextView.setText(currentProduct.getDiscount());
        }
        else{
            discountTextView.setVisibility(View.GONE);
        }

        ImageView productIcon = listItemView.findViewById(R.id.product_icon);
        if(currentProduct.getImageResourceId() != -1){
            productIcon.setVisibility(View.VISIBLE);
            productIcon.setImageResource(currentProduct.getImageResourceId());
        }
        else{
            productIcon.setVisibility(View.GONE);
        }


        LinearLayout quantityLinearLayout = listItemView.findViewById(R.id.quantity_linear_layout);
//        int quantityLinearLayoutVisibility = quantityLinearLayout.getVisibility();
//        if(quantityLinearLayoutVisibility == View.VISIBLE){
            quantityLinearLayout.setVisibility(View.GONE);
//        }

        TextView priceTextView = listItemView.findViewById(R.id.price_text_view);
//        int priceTextViewVisibility = priceTextView.getVisibility();
//        if(priceTextViewVisibility == View.VISIBLE){
            priceTextView.setVisibility(View.GONE);
//        }

        LinearLayout linearLayout = listItemView.findViewById(R.id.single_list_item);
        linearLayout.setBackgroundResource(resource);

        return listItemView;
    }
}
