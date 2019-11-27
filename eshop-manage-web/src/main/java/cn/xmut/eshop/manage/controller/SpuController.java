package cn.xmut.eshop.manage.controller;

import cn.xmut.eshop.api.model.PmsProductInfo;
import cn.xmut.eshop.api.service.SpuService;
import cn.xmut.eshop.api.vo.R;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 下午1:47
 */
@RequestMapping("/spu")
@RestController
public class SpuController {

    @Reference
    private SpuService spuService;

    @PostMapping("/list")
    public List<PmsProductInfo> listSpuInfo(@RequestParam("catalog3Id") String catalog3Id){
        return spuService.listSpuInfo(catalog3Id);
    }

    @PostMapping("/info")
    public R saveSpuInfo(@RequestBody PmsProductInfo spuInfo){
        spuService.saveSpuInfo(spuInfo);
        return R.ok();
    }

}
