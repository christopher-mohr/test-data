package test.data


import javax.inject.Singleton

@Singleton
class Storage {

    //QBiCDataSource dataSource
    //Sql sql
    /*
    @Inject
    Storage(QBiCDataSource dataSource) {
        this.dataSource = dataSource
    }
    */
     Storage() {}

    String getHelloContent() {
        return "Hello World"
    }
}

