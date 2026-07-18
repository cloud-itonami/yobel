(require '[clojure.test :as t])
(def test-namespaces
  '[yobel.cells.audit-witness.tests.test-cell
    yobel.cells.creditor-enrollment.tests.test-cell
    yobel.cells.debtor-enrollment.tests.test-cell
    yobel.cells.release-settlement.tests.test-cell
    yobel.cells.rite-declaration.tests.test-cell
    yobel.tests.test-orchestrator
    yobel.concrete-ports.tests.test-eip712-erc725
    yobel.concrete-ports.tests.test-web3-ports])
(doseq [ns-sym test-namespaces] (require ns-sym))
(let [result (apply t/run-tests test-namespaces)]
  (when-not (zero? (+ (:fail result) (:error result))) (System/exit 1)))
