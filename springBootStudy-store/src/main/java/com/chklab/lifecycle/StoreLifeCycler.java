package com.chklab.lifecycle;

import com.chklab.store.ApiTestStore;
import org.springframework.stereotype.Component;

@Component
public class StoreLifeCycler implements StoreLifeCycle {

    private final ApiTestStore apiTestStore;

    public StoreLifeCycler(ApiTestStore apiTestStore) {
        this.apiTestStore = apiTestStore;
    }

    @Override
    public ApiTestStore requestApiTestStore() {
        return this.apiTestStore;
    }
}
