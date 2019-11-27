package cn.xmut.eshop.manage.controller;

import cn.xmut.eshop.api.model.PmsBaseCatalog1;
import cn.xmut.eshop.api.model.PmsBaseCatalog2;
import cn.xmut.eshop.api.model.PmsBaseCatalog3;
import cn.xmut.eshop.api.service.CatalogService;
import cn.xmut.eshop.api.vo.R;
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
    public R listCatalog3(@RequestParam("catalog2Id") String catalog2Id){
        List<PmsBaseCatalog3> baseCatalog3s = catalogService.listCatalog3(catalog2Id);
        return R.ok(baseCatalog3s);
    }

    @PostMapping("/2/list")
    public R listCatalog2(@RequestParam("catalog1Id") String catalog1Id){
        List<PmsBaseCatalog2> baseCatalog2s = catalogService.listCatalog2(catalog1Id);
        return R.ok(baseCatalog2s);
    }

    @GetMapping("/1/list")
    public R listCatalog1(){
        List<PmsBaseCatalog1> baseCatalog1s = catalogService.listCatalog1();
        return R.ok(baseCatalog1s);
    }

}
