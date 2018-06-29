
 Checkout checkout = new Checkout(client);
 PaymentMethodsRequest paymentMethodsRequest = new PaymentMethodsRequest();
 paymentMethodsRequest.setMerchantAccount("YourMerchantAccount");
 PaymentMethodsResponse response = checkout.paymentMethods(paymentMethodsRequest);
