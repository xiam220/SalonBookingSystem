import org.springframework.data.repository.CrudRepository;

// import SalonServiceDetail;

// extends CrudRepository<[type of repository to persist], [entity ID property]>
public interface SalonServiceDetailRepository          
            extends CrudRepository<SalonServiceDetail, Long> {

            }