package B1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
    private List<CanBo> canBo;

    public QLCB() {
        this.canBo = new ArrayList<>();
    }

    public void themCanBo(CanBo canBo) {
        this.canBo.add(canBo);
    }

    public List<CanBo> timCanBoTheoTen(String ten) {
        return this.canBo.stream()
                .filter(a -> a.getTen()
                .contains(ten))
                .collect(Collectors.toList());
    }

    public void showListInforCanBo() {
        this.canBo.forEach(a -> System.out.println(a.toString()));
    }
}