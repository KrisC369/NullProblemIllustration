package local.NullIllustration;

import java.util.List;

import local.NullIllustration.SimulationComponent;

/**
 * Testing example
 * 
 * @author Kristof Coninx (kristof.coninx AT cs.kuleuven.be)
 */
public interface SimulationComponent {
    /**
     * Get the subcomponents that are also simulation components.
     * 
     * @return the subcomponents for this component or an empty list.
     */
    <T extends SimulationComponent> List<T> getCorrectSimulationSubComponents();

    /**
     * Get the subcomponents that are also simulation components.
     * 
     * @return the subcomponents for this component or an empty list.
     */
    List<? extends SimulationComponent> getErroneousSimulationSubComponents();
}
