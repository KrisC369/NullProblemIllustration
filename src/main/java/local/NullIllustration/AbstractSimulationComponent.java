package local.NullIllustration;

import java.util.Collections;
import java.util.List;

/**
 * @author Kristof Coninx (kristof.coninx AT cs.kuleuven.be)
 */
public abstract class AbstractSimulationComponent
        implements SimulationComponent {

    @Override
    public List<SimulationComponent> getCorrectSimulationSubComponents() {
        return Collections.emptyList();
    }

    @Override
    public List<SimulationComponent> getErroneousSimulationSubComponents() {
        return Collections.emptyList();
    }

}
