package com.blinkreceipt.rewards.presenter;

import com.blinkreceipt.rewards.transfer.RecognizerResults;
import com.microblink.Product;
import com.microblink.ScanResults;

import java.util.List;

import androidx.annotation.Nullable;

public final class MainPresenter {

    @Nullable
    public List<Product> products( @Nullable RecognizerResults items ) {
        if ( items != null ) {
            ScanResults results = items.results();

            return results != null ? results.products() : null;
        }

        return null;
    }

    public boolean exception( @Nullable RecognizerResults results ) {
        return results != null && results.e() != null;
    }
}
