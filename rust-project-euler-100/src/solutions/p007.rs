use crate::Solvable;

fn is_prime(n: u64) -> bool {
    if n < 2 { return false; }
    if n == 2 { return true; }
    if n % 2 == 0 { return false; }
    let limit = (n as f64).sqrt() as u64;
    let mut i = 3u64;
    while i <= limit {
        if n % i == 0 { return false; }
        i += 2;
    }
    true
}

pub struct P007;
impl Solvable for P007 {
    fn problem_name(&self) -> &str { "p007" }
    fn solve(&self) -> i64 {
        let target = 10_001;
        let mut count = 1;
        let mut current = 0u64;
        let mut i = 1u64;
        while count <= target {
            if is_prime(i) {
                current = i;
                count += 1;
            }
            i += 2;
        }
        current as i64
    }
}
