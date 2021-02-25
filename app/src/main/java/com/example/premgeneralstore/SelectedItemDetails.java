package com.example.premgeneralstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SelectedItemDetails extends AppCompatActivity {

    LinearLayout quantityLinearLayout;
    EditText quantityEditText;
    TextView productNameTextView;
    TextView priceTextView;
    Button plusButton;
    Button minusButton;
    int currentQuantity=1;

    final static String ITEM_NAME_EXTRA = "item_name";
    final static String ITEM_PRICE_EXTRA = "item_price";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_item_details);

//        String name = getIntent().getStringExtra(NAME_EXTRA);
        final String itemName = getIntent().getStringExtra(ITEM_NAME_EXTRA);
        final int itemPrice = getIntent().getIntExtra(ITEM_PRICE_EXTRA, 0);

        quantityLinearLayout = findViewById(R.id.quantity_linear_layout);
        quantityEditText = findViewById(R.id.quantity_edit_text);
        plusButton = findViewById(R.id.plus_button);
        minusButton = findViewById(R.id.minus_button);


        productNameTextView = findViewById(R.id.product_name_text_view);
        priceTextView = findViewById(R.id.price_text_view);

        productNameTextView.setText(itemName);
//        priceTextView.setText("Price: ₹" + itemPrice + "");

        final Button addToCartButton = findViewById(R.id.add_to_cart_button);
        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quantityEditText.setText("1");
                quantityLinearLayout.setVisibility(View.VISIBLE);
                priceTextView.setText("Price: ₹" + itemPrice + "");
                priceTextView.setVisibility(View.VISIBLE);
                addToCartButton.setVisibility(View.GONE);
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                currentQuantity = Integer.parseInt(quantityEditText.getText().toString());
                String newQuantity = (currentQuantity + 1) + "";
                quantityEditText.setText(newQuantity);
                String price = (itemPrice * Integer.parseInt(newQuantity)) + "";
                priceTextView.setText("Price: ₹" + price);
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentQuantity = Integer.parseInt(quantityEditText.getText().toString());

                if(currentQuantity == 1){
//                    Toast.makeText(getApplicationContext(), "Quantity can't be 0", Toast.LENGTH_SHORT).show();
                    closeKeyboard();
                    quantityLinearLayout.setVisibility(View.GONE);
                    priceTextView.setVisibility(View.GONE);
                    addToCartButton.setVisibility(View.VISIBLE);
                    return;
                }
                String newQuantity = (currentQuantity - 1) + "";
                quantityEditText.setText(newQuantity);
                String price = (itemPrice * Integer.parseInt(newQuantity)) + "";
                priceTextView.setText("Price: ₹" + price);
            }
        });

        quantityEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
//                    Log.i("TAG","Enter pressed");

//                    currentQuantity = 1;

                    String currentQuantityString = quantityEditText.getText().toString();
//                    try {

                    if(!currentQuantityString.equals(""))
                        currentQuantity = Integer.parseInt(currentQuantityString);
//                    }
//
//                    catch(NumberFormatException e){
//                        Log.i("Exception", "NumberFormatException!");
//                        quantityLinearLayout.setVisibility(View.GONE);
//                        priceTextView.setVisibility(View.GONE);
//                        addToCartButton.setVisibility(View.VISIBLE);
//                        closeKeyboard();
//                        return true;
//                    }

                    if(currentQuantityString.equals("") || currentQuantity == 0){
                        closeKeyboard();
                        quantityLinearLayout.setVisibility(View.GONE);
                        priceTextView.setVisibility(View.GONE);
                        addToCartButton.setVisibility(View.VISIBLE);

                        return true;
                    }

                    priceTextView.setText("Price: ₹" + currentQuantity * itemPrice);
                    closeKeyboard();
                    return true;
                }
                return false;
            }
        });





    }

    private void closeKeyboard()
    {
        // this will give us the view
        // which is currently focus
        // in this layout
        View view = this.getCurrentFocus();

        // if nothing is currently
        // focus then this will protect
        // the app from crash
        if (view != null) {
            // now assign the system
            // service to InputMethodManager
            InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            manager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

}
