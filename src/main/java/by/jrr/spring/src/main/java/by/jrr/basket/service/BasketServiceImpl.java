package by.jrr.basket.service;

import by.jrr.basket.entity.BasketEntity;
import by.jrr.basket.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketRepository basketRepository;

    @Override
    public BasketEntity create() {
        return basketRepository.save(new BasketEntity());
    }
}
