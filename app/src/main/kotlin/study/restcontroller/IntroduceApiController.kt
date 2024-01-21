package study.restcontroller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import study.entity.IntroduceEntity
import study.repository.IntroduceRepository

@RestController
class IntroduceApiController {

    @Autowired
    lateinit var introduceRepository :IntroduceRepository

    @GetMapping("/introduce/all")
    fun allInttoduce() :List<IntroduceEntity> {
        return introduceRepository.findAll();
    }
}