package dashboard;

import org.springframework.stereotype.Service;

@Service
public class CircleService {
	
	private CircleRepository repository;
	
	public CircleService(CircleRepository repository) {
		this.repository = repository;
	}

	public String logger(CircleDTO circle) {
		System.out.println("in logger");
		return "We gotca!";
	}

	public void createCirclePayload(CircleDTO payload) {
		// TODO Auto-generated method stub
		repository.save(payload);
	}
}
