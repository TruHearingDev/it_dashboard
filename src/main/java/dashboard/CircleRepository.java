package dashboard;

public interface CircleRepository extends Repository<CircleDTO, Long> {
	Page<CircleDTO> findAll(Pageable pageable);
}
