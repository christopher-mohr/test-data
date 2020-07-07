package test.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InformationCenter {

    private final Storage storage

    @Inject
    InformationCenter(Storage storage) {
        this.storage = storage
    }

    String getHelloContent() {
        return storage.getHelloContent()
    }

}

