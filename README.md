# yobel — collective debt-release actor

`yobel` is the standalone Tier-B actor for voluntary Shmita/Jubilee-style debt-release rites. It requires signed creditor consent, Council ratification, and a one-way principal-reduction invariant.

## Layout

- `src/yobel/` — orchestration, cells, ports, and the offline dry-run
- `test/yobel/` — unit tests plus an operator-run Anvil integration suite
- `contracts/`, `data/`, `manifest.edn`, `identity.edn` — canonical EDN
- `docs/` — actor-owned ADRs, governance, deployment, and decision documentation
- `wire/abi/`, `wire/fixtures/`, `wire/bpmn/` — external JSON and BPMN projections

Run `kbb -M:test` for the deterministic offline suite. Run `kbb -M:test:integration` only with Anvil available; it exercises the committed contract bytecode and is intentionally separate from the default gate.

The actor does not create debt, increase principal, force creditor participation, provide legal advice, or settle fiat.
