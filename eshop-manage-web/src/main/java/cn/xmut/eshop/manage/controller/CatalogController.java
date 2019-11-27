package cn.xmut.eshop.manage.controller;

import cn.xmut.eshop.api.model.PmsBaseCatalog1;
import cn.xmut.eshop.api.model.PmsBaseCatalog2;
import cn.xmut.eshop.api.model.PmsBaseCatalog3;
import cn.xmut.eshop.api.service.CatalogService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 上午8:40
 */
@RequestMapping("/catalog")
@RestController
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    @PostMapping("/3/list")
    public List<PmsBaseCatalog3> listCatalog3(@RequestParam("catalog2Id") String catalog2Id){
        return catalogService.listCatalog3(catalog2Id);
    }

    @PostMapping("/2/list")
    public List<PmsBaseCatalog2> listCatalog2(@RequestParam("catalog1Id") String catalog1Id){
        return catalogService.listCatalog2(catalog1Id);
    }

    @GetMapping("/1/list")
    public List<PmsBaseCatalog1> listCatalog1(){
        return catalogService.listCatalog1();
    }

}
