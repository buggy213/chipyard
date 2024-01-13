package chipyard

import org.chipsalliance.cde.config.{Config}
import freechips.rocketchip.diplomacy.{AsynchronousCrossing}
import freechips.rocketchip.subsystem.WithoutTLMonitors

// ------------------------------
// Configs with RoCC Accelerators
// ------------------------------

// DOC include start: GemminiRocketConfig
class GemminiRocketConfig extends Config(
  new gemmini.DefaultGemminiConfig ++                            // use Gemmini systolic array GEMM accelerator
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)
// DOC include end: GemminiRocketConfig

class FPGemminiRocketConfig extends Config(
  new gemmini.GemminiFP32DefaultConfig ++                         // use FP32Gemmini systolic array GEMM accelerator
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)

class LeanGemminiRocketConfig extends Config(
  new gemmini.LeanGemminiConfig ++                                 // use Lean Gemmini systolic array GEMM accelerator
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)

class LeanGemminiPrintfRocketConfig extends Config(
  new gemmini.LeanGemminiPrintfConfig ++                                 // use Lean Gemmini systolic array GEMM accelerator
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)

class HwachaRocketConfig extends Config(
  new chipyard.config.WithHwachaTest ++
  new hwacha.DefaultHwachaConfig ++                              // use Hwacha vector accelerator
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)

class MempressRocketConfig extends Config(
  new mempress.WithMemPress ++                                    // use Mempress (memory traffic generation) accelerator
  new chipyard.config.WithExtMemIdBits(7) ++                      // use 7 bits for tl like request id
  new chipyard.config.WithSystemBusWidth(128) ++
  new freechips.rocketchip.subsystem.WithNBanks(8) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(nWays=16, capacityKB=2048) ++
  new freechips.rocketchip.subsystem.WithNMemoryChannels(4) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class HwachaLargeBoomConfig extends Config(
  new chipyard.config.WithHwachaTest ++
  new hwacha.DefaultHwachaConfig ++                              // use Hwacha vector accelerator
  new boom.common.WithNLargeBooms(1) ++
  new chipyard.config.WithSystemBusWidth(128) ++
  new chipyard.config.AbstractConfig)

class EinsteinRocketConfig extends Config(
  new einstein.DefaultEinsteinConfig ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class SmallEinsteinRocketConfig extends Config(
  new einstein.LargeDenseEinsteinConfig(size=4) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class MidEinsteinRocketConfig extends Config(
  new einstein.LargeDenseEinsteinConfig(size=8) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class LargeEinsteinRocketConfig extends Config(
  new einstein.LargeDenseEinsteinConfig(size=16) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class SparseDenseEinsteinRocketConfig extends Config(
  new einstein.SparseDenseEinsteinConfig ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class SmallSparseDenseEinsteinRocketConfig extends Config(
  new einstein.SparseDenseEinsteinConfig(size = 4) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class MidSparseDenseEinsteinRocketConfig extends Config(
  new einstein.SparseDenseEinsteinConfig(size = 8) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class LargeSparseDenseEinsteinRocketConfig extends Config(
  new einstein.SparseDenseEinsteinConfig(size = 16) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class LoadBalancedSparseDenseEinsteinRocketConfig extends Config(
  new einstein.SparseDenseEinsteinConfig(isLoadBalanced = true) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class OSSparseDenseEinsteinRocketConfig extends Config(
  new einstein.SparseDenseEinsteinConfig(outputStationary = true) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class OuterSpaceMatmulEinsteinRocketConfig extends Config(
  new einstein.OuterSpaceEinsteinConfig(size = 2, hasMatmul = true, hasMerger = false) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class SmallOuterSpaceMatmulEinsteinRocketConfig extends Config(
  new einstein.OuterSpaceEinsteinConfig(size = 4, hasMatmul = true, hasMerger = false) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class MidOuterSpaceMatmulEinsteinRocketConfig extends Config(
  new einstein.OuterSpaceEinsteinConfig(size = 8, hasMatmul = true, hasMerger = false) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class LargeOuterSpaceMatmulEinsteinRocketConfig extends Config(
  new einstein.OuterSpaceEinsteinConfig(size = 16, hasMatmul = true, hasMerger = false) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class OuterSpaceMergerEinsteinRocketConfig extends Config(
  new einstein.OuterSpaceEinsteinConfig(size = 2, hasMatmul = false, hasMerger = true) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

class SmallOuterSpaceMergerEinsteinRocketConfig extends Config(
  new einstein.OuterSpaceEinsteinConfig(size = 4, hasMatmul = false, hasMerger = true) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class MidOuterSpaceMergerEinsteinRocketConfig extends Config(
  new einstein.OuterSpaceEinsteinConfig(size = 8, hasMatmul = false, hasMerger = true) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class LargeOuterSpaceMergerEinsteinRocketConfig extends Config(
  new einstein.OuterSpaceEinsteinConfig(size = 16, hasMatmul = false, hasMerger = true) ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)
