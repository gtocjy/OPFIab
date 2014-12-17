/*
 * Copyright 2012-2014 One Platform Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onepf.opfiab.google;

import android.support.annotation.NonNull;

import org.onepf.opfiab.model.billing.Purchase;
import org.onepf.opfiab.verification.OnVerificationListener;
import org.onepf.opfiab.verification.PurchaseVerifier;
import org.onepf.opfiab.verification.VerificationResult;

public class GooglePurchaseVerifier implements PurchaseVerifier {

    @NonNull
    private final String privateKey;

    public GooglePurchaseVerifier(@NonNull final String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public VerificationResult verify(@NonNull final Purchase purchase) {
        //TODO
        return null;
    }

    @Override
    public void verify(@NonNull final Purchase purchase,
                       @NonNull final OnVerificationListener listener) {
        //TODO
    }
}
