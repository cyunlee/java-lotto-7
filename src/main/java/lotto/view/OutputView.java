package lotto.view;

import java.util.Arrays;
import java.util.List;
import lotto.common.Prompts;

public class OutputView {
    public void showPurchaseCount(int count) {
        System.out.println(count + Prompts.OUTPUT_PURCHASE_COUNT_PROMPT);
    }

    public void showLottoNumbers(String lottoNumbers, int lottoCount) {
        System.out.println(lottoCount + Prompts.OUTPUT_PURCHASE_COUNT_PROMPT);
        System.out.println(lottoNumbers);
    }

    public void showStatistics(List<String> results) {
        System.out.println(Prompts.OUTPUT_STATISTICS_PROMPT);
        System.out.println(Prompts.OUTPUT_STATISTICS_DECO);
        showLottoResults(results);
        System.out.println(Prompts.OUTPUT_PERCENTAGE_PROMPT_PRE);
        System.out.println(Prompts.OUTPUT_PERCENTAGE_PROMPT_POST);
    }

    private void showLottoResults(List<String> result) {
        for (String s : result) {
            System.out.println(s);
        }
    }
}
