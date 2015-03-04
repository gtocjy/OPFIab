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

package org.onepf.opfiab.listener;

import android.support.annotation.NonNull;

import org.onepf.opfiab.model.event.SetupResponse;
import org.onepf.opfiab.model.event.billing.BillingRequest;
import org.onepf.opfiab.model.event.billing.BillingResponse;
import org.onepf.opfiab.model.event.billing.ConsumeResponse;
import org.onepf.opfiab.model.event.billing.InventoryResponse;
import org.onepf.opfiab.model.event.billing.PurchaseResponse;
import org.onepf.opfiab.model.event.billing.SkuDetailsResponse;

import java.util.Arrays;
import java.util.List;

public class BillingListenerCompositor implements BillingListener {

    @NonNull
    private final List<BillingListener> listeners;

    public BillingListenerCompositor(@NonNull final BillingListener... billingListeners) {
        this.listeners = Arrays.asList(billingListeners);
    }

    @Override
    public void onSetup(@NonNull final SetupResponse setupResponse) {
        for (final BillingListener billingListener : listeners) {
            billingListener.onSetup(setupResponse);
        }
    }

    @Override
    public void onRequest(@NonNull final BillingRequest billingRequest) {
        for (final BillingListener billingListener : listeners) {
            billingListener.onRequest(billingRequest);
        }
    }

    @Override
    public void onResponse(@NonNull final BillingResponse billingResponse) {
        for (final BillingListener billingListener : listeners) {
            billingListener.onResponse(billingResponse);
        }
    }

    @Override
    public void onPurchase(@NonNull final PurchaseResponse purchaseResponse) {
        for (final BillingListener billingListener : listeners) {
            billingListener.onPurchase(purchaseResponse);
        }
    }

    @Override
    public void onConsume(@NonNull final ConsumeResponse consumeResponse) {
        for (final BillingListener billingListener : listeners) {
            billingListener.onConsume(consumeResponse);
        }
    }

    @Override
    public void onInventory(@NonNull final InventoryResponse inventoryResponse) {
        for (final BillingListener billingListener : listeners) {
            billingListener.onInventory(inventoryResponse);
        }
    }

    @Override
    public void onSkuDetails(@NonNull final SkuDetailsResponse skuDetailsResponse) {
        for (final BillingListener billingListener : listeners) {
            billingListener.onSkuDetails(skuDetailsResponse);
        }
    }
}