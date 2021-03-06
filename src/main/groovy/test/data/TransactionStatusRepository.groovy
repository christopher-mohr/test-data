package test.data


import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@Repository("transactions")
@JdbcRepository(dialect = Dialect.MYSQL)
interface TransactionStatusRepository extends CrudRepository<TransactionStatus, Long> {

    @Override
    List<TransactionStatus> findAll()

    List<TransactionStatus> findAllByUuid(String uuid)

    Optional<TransactionStatus> findByUuid(String uuid)

    void updateStatus(@Id Integer id, String status);
}